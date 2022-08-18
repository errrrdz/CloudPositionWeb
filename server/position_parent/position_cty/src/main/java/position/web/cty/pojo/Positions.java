package position.web.cty.pojo;

import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * positions实体类
 * @author Administrator
 *
 */
@Entity
@Table(name="positions")
public class Positions implements Serializable{

	@Id
	private Long id;//id
	private java.util.Date createdAt;//created_at
	private java.util.Date updatedAt;//updated_at
	private java.util.Date deletedAt;//deleted_at
	private String name;//'职位名'
	private Long userId;//'用户ID'
	private Long companyId;//'公司ID'
	private String minSalary;//'最低薪资'
	private String maxSalary;//'最高薪资'
	private String fixedSalary;//'固定薪资'
	private String detail;//'职位描述'
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

	public Long getCompanyId() {
		return companyId;
	}
	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public String getMinSalary() {
		return minSalary;
	}
	public void setMinSalary(String minSalary) {
		this.minSalary = minSalary;
	}

	public String getMaxSalary() {
		return maxSalary;
	}
	public void setMaxSalary(String maxSalary) {
		this.maxSalary = maxSalary;
	}

	public String getFixedSalary() {
		return fixedSalary;
	}
	public void setFixedSalary(String fixedSalary) {
		this.fixedSalary = fixedSalary;
	}

	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}

	public Long getStatus() {
		return status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}


	
}
