/*
 *  版权信息: © 聚均科技
 */

package work.xingbili.sample;

/**
 * @author xinghuolin
 * @date 2023/4/20 14:38
 */
public interface User1Mapper {
    int insert(User1 record);
    User1 selectByPrimaryKey(Integer id);
    //其他方法省略...
}