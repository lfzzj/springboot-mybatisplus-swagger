package com.lf.codingmicroserviceedu;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Statement;
import java.util.ArrayList;

@SpringBootTest
class CodingMicroserviceEduApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void testCodeGenerator(){
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");
        gc.setOutputDir(projectPath + "/src/main/java");
        gc.setAuthor("jobob");
        gc.setOpen(false);//生成后是否打开资源管理器
        gc.setFileOverride(false);//重新生成文件时是否会覆盖
        gc.setIdType(IdType.ID_WORKER_STR);//主键策略
        gc.setServiceName("%sService");//所有自动生成的service接口首字母I去除
        gc.setDateType(DateType.ONLY_DATE);//设置日期类型
        gc.setSwagger2(true); //实体属性 Swagger2 注解

        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://127.0.0.1:3306/mydb2?useSSL=false&serverTimezone=UTC");
        // dsc.setSchemaName("public");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("123456");
        dsc.setDbType(DbType.MYSQL);
        mpg.setDataSource(dsc);

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setModuleName("edu");
        pc.setParent("com.lf.ant");
        pc.setEntity("entity");
        pc.setController("controller");
        pc.setMapper("mapper");
        pc.setService("service");
        mpg.setPackageInfo(pc);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setInclude("edu"+"_\\w");//隐射的表名
        strategy.setNaming(NamingStrategy.underline_to_camel);//数据映射到实体类的策略
        strategy.setTablePrefix("edu_");//不生成表的前缀
        strategy.setEntityLombokModel(true);//自动添加lombok注解

        //逻辑删除
        strategy.setLogicDeleteFieldName("is_deleted");//逻辑删除字段名
        strategy.setEntityBooleanColumnRemoveIsPrefix(true);//去除布尔值的is_ 前缀

        TableFill gmtCreate = new TableFill("gmt_create", FieldFill.INSERT);
        TableFill gmtModified = new TableFill("gmt_modified", FieldFill.INSERT_UPDATE);
        ArrayList<TableFill> tableFills = new ArrayList<>();
        tableFills.add(gmtCreate);
        tableFills.add(gmtModified);
        strategy.setTableFillList(tableFills);

        //乐观锁的列
        strategy.setVersionFieldName("version");

        //RestFUL
        strategy.setRestControllerStyle(true);

        //url驼峰命名 转化为 _
        strategy.setControllerMappingHyphenStyle(true);

        mpg.setStrategy(strategy);

        //执行
        mpg.execute();

    }

}
