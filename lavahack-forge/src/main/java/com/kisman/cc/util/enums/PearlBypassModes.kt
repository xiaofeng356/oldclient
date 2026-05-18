package com.kisman.cc.util.enums

/**
 * @author _kisman_
 * @since 20:34 of 07.10.2022
 */
enum class PearlBypassModes(
    val displayName : String
) {
    Normal("Normal"),
    CrystalPvPcc("crystalpvp.cc")

    ;

    override fun toString() : String = displayName
}