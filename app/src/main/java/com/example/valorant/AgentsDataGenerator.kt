package com.example.valorant

object AgentsDataGenerator {
    fun generateAgentsData(): ArrayList<agentsData> {
        val agentsKiList = arrayListOf<agentsData>()

        agentsKiList.add(agentsData(R.drawable.brimstone, "Brimstone", "Controller"))
        agentsKiList.add(agentsData(R.drawable.phx, "Phoenix", "Duelist"))
        agentsKiList.add(agentsData(R.drawable.sage, "Sage", "Sentinel"))
        agentsKiList.add(agentsData(R.drawable.sova, "Sova", "Initiator"))
        agentsKiList.add(agentsData(R.drawable.viper, "Viper", "Controller"))
        agentsKiList.add(agentsData(R.drawable.cypher, "Cypher", "Sentinel"))
        agentsKiList.add(agentsData(R.drawable.reyna, "Reyna", "Duelist"))
        agentsKiList.add(agentsData(R.drawable.killjoy, "Killjoy", "Controller"))
        agentsKiList.add(agentsData(R.drawable.breach, "Breach", "Initiator"))
        agentsKiList.add(agentsData(R.drawable.omen, "Omen", "Controller"))
        agentsKiList.add(agentsData(R.drawable.jett, "Jett", "Duelist"))
        agentsKiList.add(agentsData(R.drawable.raze, "Raze", "Duelist"))
        agentsKiList.add(agentsData(R.drawable.skye, "Skye", "Initiator"))
        agentsKiList.add(agentsData(R.drawable.yoru, "Yoru", "Duelist"))
        agentsKiList.add(agentsData(R.drawable.astra, "Astra", "Controller"))
        agentsKiList.add(agentsData(R.drawable.kayo, "Kay//o", "Initiator"))
        agentsKiList.add(agentsData(R.drawable.chamber, "Chamber", "Sentinel"))
        agentsKiList.add(agentsData(R.drawable.neon, "Neon", "Duelist"))
        agentsKiList.add(agentsData(R.drawable.fade, "Fade", "Initiator"))
        agentsKiList.add(agentsData(R.drawable.harbor, "Harbor", "Controller"))
        agentsKiList.add(agentsData(R.drawable.gekko, "Gekko", "Initiator"))
        agentsKiList.add(agentsData(R.drawable.deadlock, "Deadlock", "Sentinel"))
        agentsKiList.add(agentsData(R.drawable.iso, "Iso", "Duelist"))

        return agentsKiList
    }
}