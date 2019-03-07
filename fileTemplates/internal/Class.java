#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
* @description:     
* @author: zuoweichen
* @date: ${DATE}
* @time: ${TIME}
* Copyright (C) 2018 MTDP
* All rights reserved                                                  
*/

public class ${NAME} {
    private static final Logger LOGGER = LoggerFactory.getLogger(${NAME}.class);
}
