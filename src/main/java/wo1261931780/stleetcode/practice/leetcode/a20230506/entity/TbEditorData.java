package wo1261931780.stleetcode.practice.leetcode.a20230506.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
*Created by Intellij IDEA.
*Project:st-leetcode
*Package:wo1261931780.stleetcode.practice.leetcode.a20230506.entity
*@author liujiajun_junw
*@Date 2023-05-20-10  星期六
*@description 
*/
/**
    * 富文本表
    */
@ApiModel(description="富文本表")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "interview.tb_editor_data")
public class TbEditorData implements Serializable {
    /**
     * ID
     */
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value="ID")
    private Integer id;

    /**
     * html渲染数据
     */
    @TableField(value = "html")
    @ApiModelProperty(value="html渲染数据")
    private String html;

    /**
     * 编辑器渲染数据
     */
    @TableField(value = "`raw`")
    @ApiModelProperty(value="编辑器渲染数据")
    private String raw;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_HTML = "html";

    public static final String COL_RAW = "raw";
}