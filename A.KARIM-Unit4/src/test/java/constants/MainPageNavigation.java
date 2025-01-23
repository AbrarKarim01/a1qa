package constants;

import lombok.Getter;

@Getter
public enum MainPageNavigation {
    JAVASCRIPT_ALERT("JavaScript Alerts");

    private final String label;

    MainPageNavigation(String label) {
        this.label = label;
    }
}
