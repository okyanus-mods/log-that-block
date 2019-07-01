package club.issizler.ltb;

import club.issizler.okyanus.api.Okyanus;
import club.issizler.okyanus.api.event.BreakEvent;
import club.issizler.okyanus.api.event.EventHandler;

public class BreakListener implements EventHandler<BreakEvent> {

    @Override
    public void handle(BreakEvent event) {
        Okyanus.getServer().getLogger().info("Block broken by " + event.getPlayer().getName() + " at " + event.getLocation().toString());
    }

}
