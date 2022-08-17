package disolution;

public class Mamal {
    private MakingNoise speaker;

    public Mamal(MakingNoise speaker) {
        this.speaker = speaker;
    }

    public MakingNoise getSpeaker() {
        return speaker;
    }

    public void setSpeaker(MakingNoise speaker) {
        this.speaker = speaker;
    }
}
