package com.dev.watermark

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.ColorFilter
import android.graphics.Paint
import android.graphics.PixelFormat
import android.graphics.drawable.Drawable

class AlternateWatermarkDrawable : Drawable() {
    private val paint = Paint().apply {
        style = Paint.Style.FILL_AND_STROKE
        strokeWidth = 2F
        textSize = 80F
        color = Color.argb(30, 152, 152, 152)
    }

    override fun draw(canvas: Canvas) {
        val watermark = "watermark"
        canvas.rotate(325F)
        val initPosition = -1000F
        val horizontalGap = 400F
        val verticalGap = 600F
        for (i in 1..10) {
            for (j in 1..6) {

                canvas.drawText(
                    watermark, initPosition + (j - 1) * horizontalGap, if (j % 2 == 0) {
                        i * verticalGap
                    } else {
                        i * verticalGap + verticalGap / 2
                    }, paint
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