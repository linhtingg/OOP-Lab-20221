package hust.soict.dsai.aims.media;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import hust.soict.dsai.aims.exception.PlayerException;

public class DigitalVideoDisc extends Media implements Playable{
	private String director;
    private int length;
	private int id;
    private static int nbDigitalVideoDisc = 0;
    
    public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
	}
	
	
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
	}

	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
	}

	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}
	
	public DigitalVideoDisc(int id, String title, String category, double cost, int length, String director) {
	    super();
	    this.id = id;
	    this.title = title;
		this.category = category;
		this.cost = cost;
		this.length = length;
		this.director = director;
	}

	
	/**
     * The function takes the information stored in the object and returns it as a string
     *
     * @return A string representation of the DVD object.
     */
    public String toString(){
    	StringBuffer printDisc = new StringBuffer();
        printDisc.append("DVD");
        printDisc.append(" - ");
        printDisc.append(title);
        printDisc.append(" - ");
        printDisc.append(category);
        printDisc.append(" - ");
        printDisc.append(director);
        printDisc.append(" - ");
        printDisc.append(length);
        printDisc.append(": ");
        printDisc.append(cost);
        return  printDisc.toString();
    }
	
    /**
     * This function returns true if the title of the book is equal to the title passed in as a parameter.
     *
     * @param title The title of the page.
     * @return The boolean value of the comparison of the title of the book to the title of the book being searched for.
     */
    public boolean isMatch(String title){
        return this.title.equals(title);
    }
    
	// add method play
	@Override
	public void play() throws PlayerException {

		if (this.getLength() > 0) {
			JDialog dialog = new JDialog();
			dialog.setSize(300, 200);

			// create Label
			JLabel text = new JLabel("Title : " + this.getTitle() + " Length : " + this.getLength());
			text.setFont(new Font("Arial", Font.PLAIN, 14));
			text.setForeground(Color.BLUE);
			text.setHorizontalAlignment(SwingConstants.CENTER);
			dialog.add(text);
			dialog.setTitle("Play DVD");
			dialog.setVisible(true);
		} else
			throw new PlayerException("ERROR : DVD length is non-positive");
	}
}
