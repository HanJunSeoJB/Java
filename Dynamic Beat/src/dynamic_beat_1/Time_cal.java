package dynamic_beat_1;
import java.io.File;
import javax.sound.midi.*;


public class Time_cal {

	public static void main(String[] args) {
		try {
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();

            Sequence sequence = MidiSystem.getSequence(new File("C:\\Users\\USER\\eclipse-workspace\\Dynamic Beat\\src\\Music/music1.midi"));
            sequencer.setSequence(sequence);

            float divisionType = sequence.getDivisionType();
            int resolution = sequence.getResolution();
            float ticksPerSecond;
            if (divisionType == Sequence.PPQ) {
                ticksPerSecond = resolution * sequencer.getTempoInBPM() / 60;
            } else {
                ticksPerSecond = resolution;
            }

            for (javax.sound.midi.Track track : sequence.getTracks()) {
                for (int i = 0; i < track.size(); i++) {
                    MidiEvent event = track.get(i);
                    MidiMessage message = event.getMessage();
                    if (message instanceof ShortMessage) {
                        ShortMessage sm = (ShortMessage) message;
                        if (sm.getCommand() == ShortMessage.NOTE_ON) {
                            float seconds = event.getTick() / ticksPerSecond;
                            System.out.println("Note starts at " + seconds + " seconds");
                        }
                    }
                }
            }

            sequencer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

	}

}
