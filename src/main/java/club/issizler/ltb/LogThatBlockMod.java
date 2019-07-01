package club.issizler.ltb;

import club.issizler.okyanus.api.Mod;
import club.issizler.okyanus.api.cmd.CommandBuilder;
import club.issizler.okyanus.api.cmd.CommandManager;
import club.issizler.okyanus.api.event.EventManager;

public class LogThatBlockMod extends Mod {

    @Override
    public void init() {
        EventManager.getInstance().register(new BreakListener());
        EventManager.getInstance().register(new PlaceListener());
    }

}
