package com.example.lightsout;

import net.minecraftforge.common.ForgeConfigSpec;

public class Config {
    public static ForgeConfigSpec SPEC;
    public static ForgeConfigSpec.BooleanValue ENABLED;
    public static ForgeConfigSpec.DoubleValue DARKNESS_THRESHOLD;
    public static ForgeConfigSpec.DoubleValue TRIGGER_PROBABILITY;
    public static ForgeConfigSpec.DoubleValue DARKNESS_SCALE;
    public static ForgeConfigSpec.DoubleValue DARKNESS_GAMMA;
    public static ForgeConfigSpec.DoubleValue TIME_SCALE;
    public static ForgeConfigSpec.DoubleValue TIME_GAMMA;
    public static ForgeConfigSpec.DoubleValue DARK_TIME_FULL_SECONDS;
    public static ForgeConfigSpec.DoubleValue MAX_PROB_PER_FRAME;
    public static ForgeConfigSpec.IntValue BUFFER_SECONDS;
    public static ForgeConfigSpec.IntValue MAX_DISTANCE;
    public static ForgeConfigSpec.DoubleValue DOOM_DARK_TIME_SECONDS;
    public static ForgeConfigSpec.IntValue ZERO_LIGHT_RADIUS;
    public static ForgeConfigSpec.IntValue DOOM_TIMER1_TICKS;
    public static ForgeConfigSpec.IntValue DOOM_TIMER2_TICKS;
    public static ForgeConfigSpec.IntValue FOOTSTEP_LAST_SECONDS;
    public static ForgeConfigSpec.IntValue FOOTSTEP_PERIOD_TICKS;
    public static ForgeConfigSpec.DoubleValue FOOTSTEP_VOLUME;
    public static ForgeConfigSpec.IntValue TORCH_HAND_GRACE_TICKS;
    public static ForgeConfigSpec.DoubleValue INTENSITY_GAMMA;
    public static ForgeConfigSpec.DoubleValue GAIN_MIN;
    public static ForgeConfigSpec.DoubleValue GAIN_MAX;
    public static ForgeConfigSpec.DoubleValue PITCH_SEMITONES_MIN;
    public static ForgeConfigSpec.DoubleValue PITCH_SEMITONES_MAX;
    public static ForgeConfigSpec.IntValue LPF_CUTOFF_MIN_HZ;
    public static ForgeConfigSpec.IntValue LPF_CUTOFF_MAX_HZ;
    public static ForgeConfigSpec.DoubleValue DELAY_MS_MIN;
    public static ForgeConfigSpec.DoubleValue DELAY_MS_MAX;
    public static ForgeConfigSpec.DoubleValue DELAY_MIX_MIN;
    public static ForgeConfigSpec.DoubleValue DELAY_MIX_MAX;
    public static ForgeConfigSpec.DoubleValue DISTORTION_DRIVE_MAX;
    public static ForgeConfigSpec.IntValue BITCRUSH_BITS_MIN;
    public static ForgeConfigSpec.IntValue BITCRUSH_BITS_MAX;
    public static ForgeConfigSpec.DoubleValue DROP_PROBABILITY_PER_FRAME;
    public static ForgeConfigSpec.IntValue DROP_RUN_MIN_FRAMES;
    public static ForgeConfigSpec.IntValue DROP_RUN_MAX_FRAMES;

    private Config() {}

    public static void init() {
        ForgeConfigSpec.Builder b = new ForgeConfigSpec.Builder();
        ENABLED = b.define("enabled", true);
        DARKNESS_THRESHOLD = b.defineInRange("darknessThreshold", 0.28, 0.0, 1.0);
        TRIGGER_PROBABILITY = b.defineInRange("triggerProbability", 0.003, 0.0, 1.0);
        DARKNESS_SCALE = b.defineInRange("darknessScale", 1.0, 0.0, 10.0);
        DARKNESS_GAMMA = b.defineInRange("darknessGamma", 1.6, 0.1, 5.0);
        TIME_SCALE = b.defineInRange("timeScale", 1.5, 0.0, 10.0);
        TIME_GAMMA = b.defineInRange("timeGamma", 1.4, 0.1, 5.0);
        DARK_TIME_FULL_SECONDS = b.defineInRange("darkTimeFullSeconds", 30.0, 1.0, 300.0);
        MAX_PROB_PER_FRAME = b.defineInRange("maxProbPerFrame", 0.25, 0.0, 1.0);
        BUFFER_SECONDS = b.defineInRange("bufferSeconds", 5, 1, 20);
        MAX_DISTANCE = b.defineInRange("maxDistance", 14, 4, 48);
        DOOM_DARK_TIME_SECONDS = b.defineInRange("doomDarkTimeSeconds", 45.0, 5.0, 600.0);
        ZERO_LIGHT_RADIUS = b.defineInRange("zeroLightRadius", 4, 1, 16);
        DOOM_TIMER1_TICKS = b.defineInRange("doomTimer1Ticks", 5 * 60 * 20, 20, 60 * 60 * 20);
        DOOM_TIMER2_TICKS = b.defineInRange("doomTimer2Ticks", 5 * 60 * 20, 20, 60 * 60 * 20);
        FOOTSTEP_LAST_SECONDS = b.defineInRange("footstepLastSeconds", 20, 1, 120);
        FOOTSTEP_PERIOD_TICKS = b.defineInRange("footstepPeriodTicks", 12, 1, 40);
        FOOTSTEP_VOLUME = b.defineInRange("footstepVolume", 0.9, 0.0, 4.0);
        TORCH_HAND_GRACE_TICKS = b.defineInRange("torchHandGraceTicks", 60 * 20, 20, 10 * 60 * 20);
        INTENSITY_GAMMA = b.defineInRange("intensityGamma", 1.4, 0.5, 5.0);
        GAIN_MIN = b.defineInRange("gainMin", 0.60, 0.1, 2.0);
        GAIN_MAX = b.defineInRange("gainMax", 1.15, 0.1, 3.0);
        PITCH_SEMITONES_MIN = b.defineInRange("pitchSemitonesMin", -2.0, -24.0, 0.0);
        PITCH_SEMITONES_MAX = b.defineInRange("pitchSemitonesMax", -9.0, -24.0, -1.0);
        LPF_CUTOFF_MIN_HZ = b.defineInRange("lpfCutoffMinHz", 1500, 300, 8000);
        LPF_CUTOFF_MAX_HZ = b.defineInRange("lpfCutoffMaxHz", 5000, 1000, 12000);
        DELAY_MS_MIN = b.defineInRange("delayMsMin", 6.0, 0.0, 50.0);
        DELAY_MS_MAX = b.defineInRange("delayMsMax", 20.0, 0.0, 100.0);
        DELAY_MIX_MIN = b.defineInRange("delayMixMin", 0.10, 0.0, 1.0);
        DELAY_MIX_MAX = b.defineInRange("delayMixMax", 0.35, 0.0, 1.0);
        DISTORTION_DRIVE_MAX = b.defineInRange("distortionDriveMax", 0.65, 0.0, 3.0);
        BITCRUSH_BITS_MIN = b.defineInRange("bitcrushBitsMin", 12, 4, 16);
        BITCRUSH_BITS_MAX = b.defineInRange("bitcrushBitsMax", 16, 4, 24);
        DROP_PROBABILITY_PER_FRAME = b.defineInRange("dropProbabilityPerFrame", 0.02, 0.0, 1.0);
        DROP_RUN_MIN_FRAMES = b.defineInRange("dropRunMinFrames", 1, 1, 20);
        DROP_RUN_MAX_FRAMES = b.defineInRange("dropRunMaxFrames", 2, 1, 40);
        SPEC = b.build();
    }
}
