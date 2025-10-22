package com.example.lightsout.config;

import com.example.lightsout.config.Config;

public final class RuntimeConfig {
    public static double DARKNESS_THRESHOLD;
    public static double TRIGGER_PROBABILITY;
    public static double DARKNESS_SCALE;
    public static double DARKNESS_GAMMA;
    public static double TIME_SCALE;
    public static double TIME_GAMMA;
    public static double DARK_TIME_FULL_SEC;
    public static double MAX_PROB_PER_FRAME;
    public static int BUFFER_SECONDS;
    public static int MAX_DISTANCE;
    public static double DOOM_DARK_TIME_SEC;

    public static void syncFromForge() {
        DARKNESS_THRESHOLD   = Config.DARKNESS_THRESHOLD.get();
        TRIGGER_PROBABILITY  = Config.TRIGGER_PROBABILITY.get();
        DARKNESS_SCALE       = Config.DARKNESS_SCALE.get();
        DARKNESS_GAMMA       = Config.DARKNESS_GAMMA.get();
        TIME_SCALE           = Config.TIME_SCALE.get();
        TIME_GAMMA           = Config.TIME_GAMMA.get();
        DARK_TIME_FULL_SEC   = Config.DARK_TIME_FULL_SECONDS.get();
        MAX_PROB_PER_FRAME   = Config.MAX_PROB_PER_FRAME.get();
        BUFFER_SECONDS       = Config.BUFFER_SECONDS.get();
        MAX_DISTANCE         = Config.MAX_DISTANCE.get();
        DOOM_DARK_TIME_SEC   = Config.DOOM_DARK_TIME_SECONDS.get();
    }

    private RuntimeConfig() {
    }
}
