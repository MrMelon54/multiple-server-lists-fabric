package xyz.mrmelon54.MultipleServerLists.client.screen;

import io.github.cottonmc.cotton.gui.GuiDescription;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import xyz.mrmelon54.MultipleServerLists.client.gui.UninstallInfoGui;

public class UninstallInfoScreen extends BaseClosableScreen {
    public UninstallInfoScreen(GuiDescription description, Screen parent) {
        super(description, parent);
        if (description instanceof UninstallInfoGui uninstallInfoGui) {
            if (parent == null)
                uninstallInfoGui.setCloseInfoCallback(() -> MinecraftClient.getInstance().setScreen(null));
            else
                uninstallInfoGui.setCloseInfoCallback(parent::close);
        }
    }
}
