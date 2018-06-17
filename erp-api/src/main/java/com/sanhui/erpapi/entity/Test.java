package com.sanhui.erpapi.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author yangjb
 * @since 2018-06-16
 */
@TableName("test")
public class Test implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 角色id
     */
	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
    /**
     * 对于该角色的描述
     */
	private String description;
    /**
     * 角色名
     */
	private String name;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Test{" +
			", id=" + id +
			", description=" + description +
			", name=" + name +
			"}";
	}
}
