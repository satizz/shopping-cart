package com.example.service.factory;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Created by satish on 6/2/17.
 */
@RunWith(Arquillian.class)
public class CartFactoryTest {
    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(CartFactory.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

}
