//package com.jd.ascpect.common.base;
//
//import javax.annotation.processing.*;
//import javax.lang.model.SourceVersion;
//import javax.lang.model.element.Element;
//import javax.lang.model.element.TypeElement;
//import java.util.Set;
//
///**
// * 命名检查器
// * @author xuzhangwang
// * @date 2019/11/12 16:17
// */
//@SupportedAnnotationTypes("*")
//@SupportedSourceVersion(SourceVersion.RELEASE_8)
//public class NameCheckProcessor extends AbstractProcessor {
//
//    private NameChecker nameChecker;
//
//    /**
//     * 初始化名称检查插件
//     * @param processingEnv
//     */
//    @Override
//    public synchronized void init(ProcessingEnvironment processingEnv) {
//        super.init(processingEnv);
//        nameChecker = new NameChecker(processingEnv);
//    }
//
//    /**
//     * 对输入的语法树的各个节点进行名称检查
//     * @param annotations
//     * @param roundEnv
//     * @return
//     */
//    @Override
//    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
//        if (!roundEnv.processingOver()) {
//            for (Element element : roundEnv.getRootElements()) {
//                nameChecker.
//            }
//        }
//        return false;
//    }
//}
