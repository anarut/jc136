package academy.lesson22.patterns;

import academy.lesson22.patterns.Color;

public class Light {

    private boolean enabled;
    private Color color;
    private Integer brightness;

    public Light(boolean enabled) {
        this.enabled = enabled;
        this.color = Color.WHITE;
        this.brightness = 5;
    }

    public Light(boolean enabled, Color color, Integer brightness) {
        this.enabled = enabled;
        this.color = color;
        this.brightness = brightness;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Integer getBrightness() {
        return brightness;
    }

    public void setBrightness(Integer brightness) {
        this.brightness = brightness;
    }

    @Override
    public String toString() {
        return "Light{" +
                "enabled=" + enabled +
                ", color=" + color +
                ", brightness=" + brightness +
                '}';
    }
}
