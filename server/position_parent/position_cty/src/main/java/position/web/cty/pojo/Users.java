package position.web.cty.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
/**
 * users实体类
 * @author Administrator
 *
 */
@Entity
@Table(name="users")
public class Users implements Serializable{

	@Id
	private Long id;//id

	private java.util.Date createdAt;//created_at
	private java.util.Date updatedAt;//updated_at
	private java.util.Date deletedAt;//deleted_at
	private String name;//'用户名'
	private String email;//'邮箱'
	private String password;//'密码'
	private Long roleId;//'角色ID'

	
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

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public Long getRoleId() {
		return roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
}
