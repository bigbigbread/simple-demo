FROM openjdk:17
# 设置工作目录
WORKDIR /app
# 将宿主机的目录挂载到容器的/app目录
VOLUME /app
# 复制.jar文件到工作目录
COPY simple-demo-0.0.1-SNAPSHOT.jar /app/simple-demo.jar
# 设置容器启动时执行的命令
CMD ["java", "-jar", "simple-demo.jar", "--server.port=8081"]

