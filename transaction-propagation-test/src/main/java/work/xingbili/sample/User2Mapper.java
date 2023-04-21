/*
 *  版权信息: © 聚均科技
 */

package work.xingbili.sample;

/**
 * @author xinghuolin
 * @date 2023/4/20 14:39
 */
public interface User2Mapper {
    int insert(User2 record);
    User2 selectByPrimaryKey(Integer id);
    //其他方法省略...
}