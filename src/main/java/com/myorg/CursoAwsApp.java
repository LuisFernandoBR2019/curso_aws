package com.myorg;

import software.amazon.awscdk.core.App;

public class CursoAwsApp {
    public static void main(final String[] args) {
        App app = new App();

        VpcStack vpcStack= new  VpcStack(app, "Vpc");

        ClusterStack clusterStack =  new ClusterStack(app,"Cluster",vpcStack.getVpc());
        clusterStack.addDependency(vpcStack);
        app.synth();
    }
}
