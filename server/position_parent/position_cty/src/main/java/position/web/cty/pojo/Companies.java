package position.web.cty.pojo;

import io.swagger.annotations.ApiModel;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
/**
 * companies实体类
 * @author Administrator
 *
 */
@Entity
@Table(name="companies")
public class Companies implements Serializable{

	@Id
	private Long id;//id
	private java.util.Date createdAt;//created_at
	private java.util.Date updatedAt;//updated_at
	private java.util.Date deletedAt;//deleted_at
	private String name;//'公司名'
	private Long userId;//'用户ID'
	private Long status;//'状态'

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public java.util.Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(java.util.Date createdAt) {
		this.createdAt = createdAt;
	}

	public java.util.Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(java.util.Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public java.util.Date getDeletedAt() {
		return deletedAt;
	}
	public void setDeletedAt(java.util.Date deletedAt) {
		this.deletedAt = deletedAt;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getStatus() {
		return status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}


	
}
