package com.example.demo.entity.po;

import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;


@Data
@NoArgsConstructor
public class User implements Serializable {
    private String userId;  // 用户id
    private String userName;    // 登录用户名
    private String userPwd;     // 登录密码
    private String userRealname;    // 用户真实姓名
    private String userNickname;    // 用户昵称
    private String userImage;   // 用户头像的路径
    private String userPhone;   // 用户电话
    private String userEmail;   // 用户邮箱
    private String userSex; // 用户性别 男 女
    private Date userBirth; // 用户生日
    private int userType;   // 用户类型，0买家，1卖家
    private String userAddressId;   // 用户地址id
    private Date createTime;    // 用户创建时间
    private Date updateTime;    // 用户修改时间

    public User(String userName, String userPwd, String userRealname, String userNickname, String userImage,
                String phone, String userEmail, String sex, Date userBirth, int userType, String userAddressId) {
        this.userId = UUID.randomUUID().toString();
        this.userName = userName;
        this.userPwd = userPwd;
        this.userRealname = userRealname;
        this.userNickname = userNickname;
        this.userImage = userImage;
        this.userPhone = phone;
        this.userEmail = userEmail;
        this.userSex = sex;
        this.userBirth = userBirth;
        this.userType = userType;
        this.userAddressId = userAddressId;
        this.createTime = new Date();
        this.updateTime = new Date();
    }
}
