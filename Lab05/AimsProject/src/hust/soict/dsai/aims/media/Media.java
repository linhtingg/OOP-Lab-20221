package hust.soict.dsai.aims.media;

public abstract class Media {
	private int id;
	protected String title;
	protected String category;
	protected double cost;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Media) {
			Media media = (Media) obj;
			return this.title.equals(media.title);
		}
		return false;

	}
	
	public Media() {
		// TODO Auto-generated constructor stub
	}

}
