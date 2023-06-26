package fi.hassunaama.cobifire

import org.bukkit.plugin.java.JavaPlugin

class Cobifire : JavaPlugin() {
    override fun onEnable() {
        // Pismo

        // tell the server that ismo woke up
        logger.info("Niksi-Ismo builder LOADED!")
    }

    override fun onDisable() {
        // Pseppo

        // tell the server that ismo goes to sleep and seppo is weird
        logger.info("Niksi-Ismo builder UNLOADED, and Seppo meni kasinolle")
    }
}