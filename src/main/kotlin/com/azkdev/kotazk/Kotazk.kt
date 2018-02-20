package com.azkdev.kotazk

import processing.core.PApplet
import processing.core.PConstants
import processing.core.PImage

/**
 * @author "azkdev"
 * Kotlin and Processing development.
 * This class will contain all the game classes.
 */
class Kotazk: PApplet() {

    lateinit var hero: Hero
    lateinit var axis: Axis

    /**
     * Initialize settings.
     * Setting canvas width and height.
     */
    override fun settings() {
        size(CW, CH)
    }

    /**
     * Setup function.
     * Here we'll instantiate models, variables.
     */
    override fun setup() {
        frameRate(FR)
        background(BG)
        axis = Axis()
        hero = Hero()
    }

    /**
     * Draw function.
     * Infinite loop for drawing content.
     */
    override fun draw() {
        background(BG)
        axis.draw()
        hero.draw()
    }

    /**
     * Parent class for characters (hero, enemy).
     */
    open inner class Character(
            var x: Float = CW * .5F - HR * .5F,
            var y: Float = CH * .5F,
            var r: Float = HR
    )

    /**
     * Our hero.
     */
    inner class Hero(
            private var texture: PImage = requestImage(HT)
    ): Character(y = CH - 150F) {

        fun draw() {
            image(texture, x, y, r, r)
        }

    }

    /**
     * Axis class.
     */
    inner class Axis(
            var x: Float = CW * .5F,
            var y: Float = CH * 1F,
            var w: Float = CW * 1.3F,
            var h: Float = 300F,
            var a1: Float = PConstants.PI + PConstants.QUARTER_PI,
            var a2: Float = PConstants.TWO_PI - PConstants.QUARTER_PI
    ) {

        fun draw() {
            noFill()
            stroke(AC)
            arc(x, y, w, h, a1, a2)
        }

    }

}

/**
 * Main function.
 * Entry point for our game.
 */
fun main(args: Array<String>) {
    PApplet.main("com.azkdev.kotazk.Kotazk")
}