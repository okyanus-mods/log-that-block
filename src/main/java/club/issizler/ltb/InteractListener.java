package club.issizler.ltb;

import club.issizler.okyanus.api.Okyanus;
import club.issizler.okyanus.api.event.EventHandler;
import club.issizler.okyanus.api.event.InteractBlockEvent;

public class InteractListener implements EventHandler<InteractBlockEvent> {

    @Override
    public void handle(InteractBlockEvent event) {
        Okyanus.getServer().getLogger().info("Block interacted by " + event.getPlayer().getName() + " at " + event.getLocation());
    }

}
