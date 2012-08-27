package padcms.dao.issue.bean;

import java.util.List;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table NOTE.
 */
public class Element {

	private Long id;
	private Long page_id;
	private String element_type_name;
	private Long weight;
	private byte[] content_text;
	private List<ElementData> listElementData;

	public Element() {
	}

	public Element(Long id) {
		this.id = id;
	}

	public Element(Long id, Long page_id, String element_type_name,
			Long weight, byte[] content_text) {
		super();
		this.id = id;
		this.page_id = page_id;
		this.weight = weight;
		this.element_type_name = element_type_name;
		this.content_text = content_text;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPage_id() {
		return page_id;
	}

	public void setPage_id(Long page_id) {
		this.page_id = page_id;
	}

	public Long getWeight() {
		return weight;
	}

	public void setWeight(Long weight) {
		this.weight = weight;
	}

	public byte[] getContent_text() {
		return content_text;
	}

	public void setContent_text(byte[] content_text) {
		this.content_text = content_text;
	}

	public List<ElementData> getListElementData() {
		return listElementData;
	}

	public void setListElementData(List<ElementData> listElementData) {
		this.listElementData = listElementData;
	}

	public String getElement_type_name() {
		return element_type_name;
	}

	public void setElement_type_name(String element_type_name) {
		this.element_type_name = element_type_name;
	}

}