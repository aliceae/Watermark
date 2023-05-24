package com.dev.watermark

import android.graphics.*
import android.graphics.drawable.Drawable

class WatermarkDrawable : Drawable() {

    private val paint = Paint().apply {
        style = Paint.Style.FILL_AND_STROKE
        strokeWidth = 2F
        textSize = 80F
        color = Color.argb(200, 150, 150, 150)
    }

    override fun draw(canvas: Canvas) {
        canvas.rotate(345F)
        val watermark = "watermark"
        val initPosition = -1000F
        val horizontalGap = 600F
        val verticalGap = 600F
        for (i in 1 until 10) {
            for (j in 1 until 10) {
                canvas.drawText(
                    watermark,
                    initPosition + (j - 1) * horizontalGap,
                    i * verticalGap,
                    paint
                )
            }
        }
    }


    override fun setAlpha(alpha: Int) {
    }

    override fun setColorFilter(colorFilter: ColorFilter?) {
    }

    override fun getOpacity(): Int = PixelFormat.OPAQUE
}