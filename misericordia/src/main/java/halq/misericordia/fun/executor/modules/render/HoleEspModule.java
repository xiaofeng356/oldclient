package halq.misericordia.fun.executor.modules.render;

import halq.misericordia.fun.core.modulecore.Category;
import halq.misericordia.fun.core.modulecore.Module;
import halq.misericordia.fun.events.RenderEvent;
import halq.misericordia.fun.executor.settings.SettingBoolean;
import halq.misericordia.fun.executor.settings.SettingDouble;
import halq.misericordia.fun.executor.settings.SettingInteger;
import halq.misericordia.fun.executor.settings.SettingMode;
import halq.misericordia.fun.executor.utils.HoleUtils;
import halq.misericordia.fun.utils.utils.RenderUtil;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;

import java.awt.*;
import java.util.Arrays;

/**
 * @author Halq
 * @since 16/01/2023 at 14:27
 */

public class HoleEspModule extends Module {


    SettingMode mode = create("PosMode", "Inside", Arrays.asList("Inside", "Up", "Down", "Double", "Slab"));
    SettingMode renderMode = create("RenderMode", "Esp", Arrays.asList("Gradient", "Esp", "Outline"));
    SettingDouble range = create("Range", 4.5, 0, 15);
    SettingInteger red = create("BRed", 0, 0, 255);
    SettingInteger green = create("BGreen", 255, 0, 255);
    SettingInteger blue = create("BBlue", 0, 0, 255);
    SettingInteger alpha = create("BAlpha", 110, 0, 255);
    SettingInteger ored = create("ORed", 0, 0, 255);
    SettingInteger ogreen = create("OGreen", 0, 0, 255);
    SettingInteger oblue = create("OBlue", 255, 0, 255);
    SettingInteger oalpha = create("OAlpha", 110, 0, 255);
    SettingBoolean cancelInside = create("RenderInside", true);

    public HoleEspModule() {
        super("HoleEsp", Category.RENDER);
    }

    @Override
    public void onRender3D(RenderEvent event) {
        for (BlockPos blockpos : HoleUtils.getBedrockHoles(range.getValue().floatValue())) {
            AxisAlignedBB bb = null;

            switch (mode.getValue()) {
                case "Inside":
                    bb = new AxisAlignedBB(blockpos.getX() - mc.getRenderManager().viewerPosX, blockpos.getY() - mc.getRenderManager().viewerPosY, blockpos.getZ() - mc.getRenderManager().viewerPosZ, blockpos.getX() + 1 - mc.getRenderManager().viewerPosX, blockpos.getY() + 1 - mc.getRenderManager().viewerPosY, blockpos.getZ() + 1 - mc.getRenderManager().viewerPosZ);
                    break;
                case "Down":
                    bb = new AxisAlignedBB(blockpos.getX() - mc.getRenderManager().viewerPosX, blockpos.getY() - mc.getRenderManager().viewerPosY - 1, blockpos.getZ() - mc.getRenderManager().viewerPosZ, blockpos.getX() + 1 - mc.getRenderManager().viewerPosX, blockpos.getY() + 1 - mc.getRenderManager().viewerPosY - 1, blockpos.getZ() + 1 - mc.getRenderManager().viewerPosZ);
                    break;
                case "Up":
                    bb = new AxisAlignedBB(blockpos.getX() - mc.getRenderManager().viewerPosX, blockpos.getY() - mc.getRenderManager().viewerPosY + 1, blockpos.getZ() - mc.getRenderManager().viewerPosZ, blockpos.getX() + 1 - mc.getRenderManager().viewerPosX, blockpos.getY() + 1 - mc.getRenderManager().viewerPosY + 1, blockpos.getZ() + 1 - mc.getRenderManager().viewerPosZ);
                    break;
                case "Double":
                    bb = new AxisAlignedBB(blockpos.getX() - mc.getRenderManager().viewerPosX, blockpos.getY() - mc.getRenderManager().viewerPosY, blockpos.getZ() - mc.getRenderManager().viewerPosZ, blockpos.getX() + 1 - mc.getRenderManager().viewerPosX, blockpos.getY() + 1 - mc.getRenderManager().viewerPosY + 1, blockpos.getZ() + 1 - mc.getRenderManager().viewerPosZ);
                    break;
                case "Slab":
                    bb = new AxisAlignedBB(blockpos.getX() - mc.getRenderManager().viewerPosX, blockpos.getY() - mc.getRenderManager().viewerPosY, blockpos.getZ() - mc.getRenderManager().viewerPosZ, blockpos.getX() + 1 - mc.getRenderManager().viewerPosX, blockpos.getY() + 1 - mc.getRenderManager().viewerPosY - 0.5, blockpos.getZ() + 1 - mc.getRenderManager().viewerPosZ);
                    break;
            }


            if (RenderUtil.isInViewFrustrum(new AxisAlignedBB(bb.minX + mc.getRenderManager().viewerPosX, bb.minY + mc.getRenderManager().viewerPosY, bb.minZ + mc.getRenderManager().viewerPosZ, bb.maxX + mc.getRenderManager().viewerPosX, bb.maxY + mc.getRenderManager().viewerPosY, bb.maxZ + mc.getRenderManager().viewerPosZ))) {

                Color color = new Color(red.getValue().floatValue() / 255f, green.getValue().floatValue() / 255f, blue.getValue().floatValue() / 255f, alpha.getValue().floatValue() / 255f);

                switch (renderMode.getValue()) {
                    case "Gradient":
                        Color color2 = new Color(red.getValue().floatValue() / 255f, green.getValue().floatValue() / 255f, blue.getValue().floatValue() / 255f, alpha.getValue().floatValue() / 255f / 5.5f);
                        RenderUtil.drawGradientFilledBox(bb, color, color2);
                        break;
                    case "Esp":
                        RenderUtil.drawGradientFilledBox(bb, color, color);
                        break;
                    case "Outline":
                        RenderUtil.drawGradientBlockOutline(bb, color, color, 1.5f);
                        break;
                }
            }
        }

        for (BlockPos blockpos : HoleUtils.getObsidianHoles(range.getValue().floatValue())) {
            AxisAlignedBB bb = null;


            switch (mode.getValue()) {
                case "Inside":
                    bb = new AxisAlignedBB(blockpos.getX() - mc.getRenderManager().viewerPosX, blockpos.getY() - mc.getRenderManager().viewerPosY, blockpos.getZ() - mc.getRenderManager().viewerPosZ, blockpos.getX() + 1 - mc.getRenderManager().viewerPosX, blockpos.getY() + 1 - mc.getRenderManager().viewerPosY, blockpos.getZ() + 1 - mc.getRenderManager().viewerPosZ);
                    break;
                case "Down":
                    bb = new AxisAlignedBB(blockpos.getX() - mc.getRenderManager().viewerPosX, blockpos.getY() - mc.getRenderManager().viewerPosY - 1, blockpos.getZ() - mc.getRenderManager().viewerPosZ, blockpos.getX() + 1 - mc.getRenderManager().viewerPosX, blockpos.getY() + 1 - mc.getRenderManager().viewerPosY - 1, blockpos.getZ() + 1 - mc.getRenderManager().viewerPosZ);
                    break;
                case "Up":
                    bb = new AxisAlignedBB(blockpos.getX() - mc.getRenderManager().viewerPosX, blockpos.getY() - mc.getRenderManager().viewerPosY + 1, blockpos.getZ() - mc.getRenderManager().viewerPosZ, blockpos.getX() + 1 - mc.getRenderManager().viewerPosX, blockpos.getY() + 1 - mc.getRenderManager().viewerPosY + 1, blockpos.getZ() + 1 - mc.getRenderManager().viewerPosZ);
                    break;
                case "Double":
                    bb = new AxisAlignedBB(blockpos.getX() - mc.getRenderManager().viewerPosX, blockpos.getY() - mc.getRenderManager().viewerPosY, blockpos.getZ() - mc.getRenderManager().viewerPosZ, blockpos.getX() + 1 - mc.getRenderManager().viewerPosX, blockpos.getY() + 1 - mc.getRenderManager().viewerPosY + 1, blockpos.getZ() + 1 - mc.getRenderManager().viewerPosZ);
                    break;
                case "Slab":
                    bb = new AxisAlignedBB(blockpos.getX() - mc.getRenderManager().viewerPosX, blockpos.getY() - mc.getRenderManager().viewerPosY, blockpos.getZ() - mc.getRenderManager().viewerPosZ, blockpos.getX() + 1 - mc.getRenderManager().viewerPosX, blockpos.getY() + 1 - mc.getRenderManager().viewerPosY - 0.5, blockpos.getZ() + 1 - mc.getRenderManager().viewerPosZ);
                    break;
            }

            if (RenderUtil.isInViewFrustrum(new AxisAlignedBB(bb.minX + mc.getRenderManager().viewerPosX, bb.minY + mc.getRenderManager().viewerPosY, bb.minZ + mc.getRenderManager().viewerPosZ, bb.maxX + mc.getRenderManager().viewerPosX, bb.maxY + mc.getRenderManager().viewerPosY, bb.maxZ + mc.getRenderManager().viewerPosZ))) {

                Color color = new Color(ored.getValue().floatValue() / 255f, ogreen.getValue().floatValue() / 255f, oblue.getValue().floatValue() / 255f, oalpha.getValue().floatValue() / 255f);

                switch (renderMode.getValue()) {
                    case "Gradient":
                        Color color2 = new Color(ored.getValue().floatValue() / 255f, ogreen.getValue().floatValue() / 255f, oblue.getValue().floatValue() / 255f, oalpha.getValue().floatValue() / 255f / 5.5f);
                        RenderUtil.drawGradientFilledBox(bb, color, color2);
                        break;
                    case "Esp":
                        RenderUtil.drawGradientFilledBox(bb, color, color);
                        break;
                    case "Outline":
                        RenderUtil.drawGradientBlockOutline(bb, color, color, 1.5f);
                        break;
                }
            }
        }

        for (BlockPos blockpos : HoleUtils.getBothHoles(range.getValue().floatValue())) {
            AxisAlignedBB bb = null;

            switch (mode.getValue()) {
                case "Inside":
                    bb = new AxisAlignedBB(blockpos.getX() - mc.getRenderManager().viewerPosX, blockpos.getY() - mc.getRenderManager().viewerPosY, blockpos.getZ() - mc.getRenderManager().viewerPosZ, blockpos.getX() + 1 - mc.getRenderManager().viewerPosX, blockpos.getY() + 1 - mc.getRenderManager().viewerPosY, blockpos.getZ() + 1 - mc.getRenderManager().viewerPosZ);
                    break;
                case "Down":
                    bb = new AxisAlignedBB(blockpos.getX() - mc.getRenderManager().viewerPosX, blockpos.getY() - mc.getRenderManager().viewerPosY - 1, blockpos.getZ() - mc.getRenderManager().viewerPosZ, blockpos.getX() + 1 - mc.getRenderManager().viewerPosX, blockpos.getY() + 1 - mc.getRenderManager().viewerPosY - 1, blockpos.getZ() + 1 - mc.getRenderManager().viewerPosZ);
                    break;
                case "Up":
                    bb = new AxisAlignedBB(blockpos.getX() - mc.getRenderManager().viewerPosX, blockpos.getY() - mc.getRenderManager().viewerPosY + 1, blockpos.getZ() - mc.getRenderManager().viewerPosZ, blockpos.getX() + 1 - mc.getRenderManager().viewerPosX, blockpos.getY() + 1 - mc.getRenderManager().viewerPosY + 1, blockpos.getZ() + 1 - mc.getRenderManager().viewerPosZ);
                    break;
                case "Double":
                    bb = new AxisAlignedBB(blockpos.getX() - mc.getRenderManager().viewerPosX, blockpos.getY() - mc.getRenderManager().viewerPosY, blockpos.getZ() - mc.getRenderManager().viewerPosZ, blockpos.getX() + 1 - mc.getRenderManager().viewerPosX, blockpos.getY() + 1 - mc.getRenderManager().viewerPosY + 1, blockpos.getZ() + 1 - mc.getRenderManager().viewerPosZ);
                    break;
                case "Slab":
                    bb = new AxisAlignedBB(blockpos.getX() - mc.getRenderManager().viewerPosX, blockpos.getY() - mc.getRenderManager().viewerPosY, blockpos.getZ() - mc.getRenderManager().viewerPosZ, blockpos.getX() + 1 - mc.getRenderManager().viewerPosX, blockpos.getY() + 1 - mc.getRenderManager().viewerPosY - 0.5, blockpos.getZ() + 1 - mc.getRenderManager().viewerPosZ);
                    break;
            }

            if (RenderUtil.isInViewFrustrum(new AxisAlignedBB(bb.minX + mc.getRenderManager().viewerPosX, bb.minY + mc.getRenderManager().viewerPosY, bb.minZ + mc.getRenderManager().viewerPosZ, bb.maxX + mc.getRenderManager().viewerPosX, bb.maxY + mc.getRenderManager().viewerPosY, bb.maxZ + mc.getRenderManager().viewerPosZ))) {
                Color color = new Color(ored.getValue().floatValue() / 255f, ogreen.getValue().floatValue() / 255f, oblue.getValue().floatValue() / 255f, oalpha.getValue().floatValue() / 255f);

                switch (renderMode.getValue()) {
                    case "Gradient":
                        Color color2 = new Color(ored.getValue().floatValue() / 255f, ogreen.getValue().floatValue() / 255f, oblue.getValue().floatValue() / 255f, oalpha.getValue().floatValue() / 255f / 5.5f);
                        RenderUtil.drawGradientFilledBox(bb, color, color2);
                        break;
                    case "Esp":
                        RenderUtil.drawGradientFilledBox(bb, color, color);
                        break;
                    case "Outline":
                        RenderUtil.drawGradientBlockOutline(bb, color, color, 1.5f);
                        break;
                }
            }
        }
    }
}
