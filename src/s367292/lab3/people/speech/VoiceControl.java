package s367292.lab3.people.speech;

public interface VoiceControl {
    void increaceVoice(int step);
    void reductionVoice(int step);
    void setVoiceLevel(int voiceLevel);
    void babble();
}
