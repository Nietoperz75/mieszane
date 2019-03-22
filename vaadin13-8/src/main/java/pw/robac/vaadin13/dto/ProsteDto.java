package pw.robac.vaadin13.dto;

public class ProsteDto {
	
	private Integer id;
	private String name;
	private String subName;
	
	public ProsteDto() {}
	
	public ProsteDto(Integer id, String name, String subName) {
		this.id = id;
		this.name = name;
		this.subName = subName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	@Override
	public String toString() {
		return "ProsteDto [" + (id != null ? "id=" + id + ", " : "") + (name != null ? "name=" + name + ", " : "")
				+ (subName != null ? "subName=" + subName : "") + "]";
	}
	
	 
}
