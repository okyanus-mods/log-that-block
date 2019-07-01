package club.issizler.ltb;

import club.issizler.okyanus.api.Okyanus;
import club.issizler.okyanus.api.event.EventHandler;
import club.issizler.okyanus.api.event.PlaceEvent;

public class PlaceListener implements EventHandler<PlaceEvent> {

    @Override
    public void handle(PlaceEvent event) {
        Okyanus.getServer().getLogger().info("Block placed by " + event.getPlayer().getName() + " at " + event.getLocation().toString());
    }

}
