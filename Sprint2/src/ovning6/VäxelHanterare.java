package ovning6;
public class VäxelHanterare {
    public int prisAttBetala;
    public int betaldBelopp;
    Valörer v = new Valörer();

    void VäxelRäknare() {
        int mellanSkillnaden = 0;

        mellanSkillnaden = betaldBelopp - prisAttBetala;

        for (int i = 0; mellanSkillnaden > 0; i++) {
            while (betaldBelopp > prisAttBetala) {
                int antalValör = 0;
                if (mellanSkillnaden > v.getValörer()[i]) {
                    mellanSkillnaden = mellanSkillnaden - v.getValörer()[i];
                    antalValör++;
                }
            }
            i++;

        }
    }
}

