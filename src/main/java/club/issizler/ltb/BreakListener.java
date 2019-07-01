package club.issizler.ltb;

import club.issizler.okyanus.api.Server;
import club.issizler.okyanus.api.event.BreakEvent;
import club.issizler.okyanus.api.event.EventHandler;

public class BreakListener implements EventHandler<BreakEvent> {

    @Override
    public void handle(BreakEvent event) {
        Server.getInstance().getLogger().info("Block broken by " + event.getPlayer().getName() + " at " + event.getLocation().toString());
    }

}
