package club.issizler.ltb;

import club.issizler.okyanus.api.Mod;

public class LogThatBlockMod extends Mod {

    @Override
    public void init() {
        registerEvent(new BreakListener());
        registerEvent(new PlaceListener());
    }

}
