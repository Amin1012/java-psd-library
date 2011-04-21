package psd.parser.layer.additional.effects;

import psd.parser.BlendMode;

import java.awt.*;

public class SolidFillEffect extends PSDEffect {

    private BlendMode blendMode;
    private Color highlightColor;
    private int opacity;
    private Color nativeColor;

    public SolidFillEffect(){
        super("sofi");
    }

    public BlendMode getBlendMode() {
        return blendMode;
    }

    public void setBlendMode(BlendMode blendMode) {
        this.blendMode = blendMode;
    }

    public Color getHighlightColor() {
        return highlightColor;
    }

    public void setHighlightColor(Color highlightColor) {
        this.highlightColor = highlightColor;
    }

    public int getOpacity() {
        return opacity;
    }

    public void setOpacity(int opacity) {
        this.opacity = opacity;
    }

    public Color getNativeColor() {
        return nativeColor;
    }

    public void setNativeColor(Color nativeColor) {
        this.nativeColor = nativeColor;
    }
}
