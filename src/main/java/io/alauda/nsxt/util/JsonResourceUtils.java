package io.alauda.nsxt.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.FileCopyUtils;

import java.io.File;
import java.net.URL;
import java.nio.charset.StandardCharsets;

@Slf4j
public class JsonResourceUtils {

    private JsonResourceUtils() {

    }

    //filename 为文件名字 如 “/json/app_version_info.json”
    public static JSONObject getJsonObjFromResource(String filename) {
        JSONObject json = null;

        if (!filename.contains(".json")) {
            filename += ".json";
        }
        ClassPathResource cpr = new ClassPathResource(filename);
//            URL url = JsonResourceUtils.class.getResource(filename);
//            String path = url.getPath();
//            File file = new File(path);
//            File file = new File(JsonResourceUtils.class.getClassLoader().getResource(filename).getFile());

//            if (file.exists()) {
//                String content = FileUtils.readFileToString(file, "UTF-8");
//                json = JSON.parseObject(content);
//            } else {
//                log.info("file not exist!");
//            }
        try {
            if (cpr.exists()) {
                byte[] data = FileCopyUtils.copyToByteArray(cpr.getInputStream());
                String content = new String(data, StandardCharsets.UTF_8);
                json = JSON.parseObject(content);
            } else {
                log.info("file not exist!");
            }
        } catch (Exception e) {
            e.printStackTrace();
            log.info("readFileToString" + e.getMessage());
        }

        return json;
    }
}
