package club.issizler.ltb;

import club.issizler.okyanus.api.Server;
import club.issizler.okyanus.api.event.EventHandler;
import club.issizler.okyanus.api.event.PlaceEvent;

public class PlaceListener implements EventHandler<PlaceEvent> {

    @Override
    public void handle(PlaceEvent event) {
        Server.getInstance().getLogger().info("Block placed by " + event.getPlayer().getName() + " at " + event.getLocation().toString());
    }

}
