# first-spring-boot
我的第一个vscode开发

# 环境搭建
  1. 安装vs的boot插件Spring Initializr Java Support;安装Java Extension Pack 对java支持；安装Maven for Java；然后使用Gradle估计需要安装vscode-gradle-language？
  2. 文件---》首选项--》设置--》用户设置加入如下内容：
    "java.home": "D:\\soft\\java\\jdk1.8.0_152",//jdk目录
    "java.configuration.maven.userSettings": "D:\\soft\\apache-maven-3.5.2\\conf\\settings.xml",//maven配置
    "maven.terminal.useJavaHome": true,
    "maven.executable.path": "D:\\soft\\apache-maven-3.5.2\\bin\\mvn.cmd",//maven运行文件
    "maven.terminal.customEnv": [//自定义环境变量
        {"environmentVariable": "JAVA_HOME",
        "value": "D:\\soft\\java\\jdk1.8.0_152"}
    ]
  3. ctrl+shift+p 搜索spring 就可以像idea一样设置项目初始化步骤。最后选择生成到哪个目录。生成完点击open 就能打开项目，如果需要debug，打开调试选择带红点的设置按钮就能生成调试luanch.json 一个是单文件运行，一个是以boot启动文件运行。
