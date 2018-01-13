package jp.ac.uryukyu.ie.e175749;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class PokeGatyaTest {
    @Test
    public void choice() {
        String[] ssr = {"フリーザー", "ファイアー", "サンダー"};
        PokeGatya gatya=new PokeGatya();
        gatya.choice(0,ssr);
        assertEquals(gatya.monster,"フリーザー");
        gatya.choice(1,ssr);
        assertEquals(gatya.monster,"ファイアー");
        gatya.choice(2,ssr);
        assertEquals(gatya.monster,"サンダー");
    }

}