package hust.soict.dsai.aims.media;
import java.util.List;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.text.html.HTMLDocument.Iterator;

import hust.soict.dsai.aims.exception.PlayerException;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;

public class CompactDisc extends Media implements Playable{
	private String artist;
    private List<Track> tracks = new ArrayList<Track>();
    
    public boolean addTrack(Track newTrack) {
        if(tracks.contains(newTrack)){
            return false;
        } else {
            tracks.add(newTrack);
            return true;
        }
    }

    public boolean removeTrack(Track track) {
        if(tracks.contains(track)){
            tracks.remove(track);
            return true;
        } else {
            return false;
        }
    }

    public int getLength(){
        int total = 0;
        for (Track i : tracks) {
            total += i.getLength();
          }
        return total;
    }
    
	// add method play
	@Override
	public void play() throws PlayerException {
		int size = tracks.size();
		JPanel layout = new JPanel(new GridLayout(size, 1));
		if (this.getLength() < 0) {
			throw new PlayerException("ERROR : CD length is non-positive");
		}
		for (Track track : tracks) {
			if (track.getLength() > 0) {
				// create Label
				JLabel text = new JLabel("Title : " + track.getTitle() + " Length : " + track.getLength());
				text.setFont(new Font("Arial", Font.PLAIN, 14));
				text.setForeground(Color.BLUE);
				text.setHorizontalAlignment(SwingConstants.CENTER);
				layout.add(text);
			} else
				throw new PlayerException("ERROR : Track length is non-positive");
		}
		JDialog dialog = new JDialog();
		dialog.setSize(300, 200);
		dialog.add(layout);
		dialog.setTitle("Play CD");
		dialog.setVisible(true);
	}


    public boolean isMatch(String title) {
        return this.getTitle().equals(title);
    }
}
}
