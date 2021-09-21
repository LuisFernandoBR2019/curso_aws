package com.myorg;

import software.amazon.awscdk.core.App;

public class CursoAwsApp {
    public static void main(final String[] args) {
        App app = new App();

        new VpcStack(app, "Vpc");

        app.synth();
    }
}
