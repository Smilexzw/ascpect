//package com.jd.ascpect.common.base;
//
//import javax.annotation.processing.Messager;
//import javax.annotation.processing.ProcessingEnvironment;
//import javax.lang.model.element.*;
//import javax.lang.model.util.ElementScanner8;
//import javax.tools.Diagnostic;
//import java.util.EnumSet;
//
///**
// * 程序名称规范的编译器插件
// * 如果编译器命名不规范, 将会输出一个编译器WARNING信息
// * @author xuzhangwang
// * @date 2019/11/12 16:19
// */
//public class NameChecker {
//    private final Messager messager;
//
//    NameCheckScanner nameCheckScanner = new NameCheckScanner();
//
//    public NameChecker(ProcessingEnvironment processingEnv) {
//        this.messager = processingEnv.getMessager();
//    }
//
//    /**
//     * 对Java程序命名进行检查, 根据Java语言程序规范
//     * 1、类和接口：符合驼式命名法，首字母大写
//     * 2、方法: 符合驼式命名法，首字母小写
//     * 3、字段
//     *
//     * 4、类、实例变量：符合驼式命名法，首字母小写
//     * 5、常量： 要求全部大写
//     * @param element
//     */
//    public void checkNames(Element element) {
//        nameCheckScanner.scan(element);
//    }
//
//    /**
//     * 名称检查器实现类，继承JDK 8中的ElementScanner8
//     * 将会Visitor的模式继续访问抽象语法树中的元素
//     */
//    private class NameCheckScanner extends ElementScanner8<Void, Void> {
//        /**
//         * 此方法用于检查Java类
//         * @param e
//         * @param p
//         * @return
//         */
//        @Override
//        public Void visitType(TypeElement e, Void p) {
//           return visit(e, p);
//        }
//
//        /**
//         * 检查方法命名是否合法
//         * @param e
//         * @param p
//         * @return
//         */
//        @Override
//        public Void visitTypeParameter(TypeParameterElement e, Void p) {
//            return super.visitTypeParameter(e, p);
//        }
//
//        /**
//         * 检查变量命名是否合法
//         * @param e
//         * @param p
//         * @return
//         */
//        @Override
//        public Void visitVariable(VariableElement e, Void p) {
//            return super.visitVariable(e, p);
//        }
//
//        /**
//         * 判断一个变量是否是常量
//         * @param e
//         * @return
//         */
//        public boolean heuristicallyConstant(VariableElement e) {
//            if (e.getEnclosingElement().getKind() == ElementKind.INTERFACE) {
//                return true;
//            } else if (e.getKind() == ElementKind.FIELD && e.getModifiers().containsAll(EnumSet.of(Modifier.FINAL, Modifier.PUBLIC, Modifier.STATIC))) {
//                return true;
//            } else {
//                return false;
//            }
//        }
//
//        /**
//         * 检查传入的Element是否符合驼式命名法, 如果不合法就输出警告信息
//         * @param e
//         * @param initialCaps
//         */
//        public void checkCamelCase(Element e, boolean initialCaps) {
//            String name = e.getSimpleName().toString();
//            boolean previousUpper = false;
//            boolean conventional = true;
//            int firstCodePoint = name.codePointAt(0);
//            if (Character.isUpperCase(firstCodePoint)) {
//                previousUpper = true;
//                if (!initialCaps) {
//                    messager.printMessage(Diagnostic.Kind.WARNING, "名称" + name + "应当以小写字母开头", e);
//                    return;
//                }
//            }
//
//
//        }
//    }
//}
