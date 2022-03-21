package edu.hitsz.prop;

import edu.hitsz.application.Game;
import edu.hitsz.application.Main;
import edu.hitsz.basic.FlyingObject;

/**
 * 子弹类。
 * 也可以考虑不同类型的子弹
 *
 * @author hitsz
 */
public class AbstractProp extends FlyingObject {

    private int power = 10;
    public int prop;

    public AbstractProp(int locationX, int locationY, int speedX, int speedY, int prop) {
        super(locationX, locationY, speedX, speedY);
        this.prop = prop;
    }

    @Override
    public void forward() {
        super.forward();

        // 判定 x 轴出界
        if (locationX <= 0 || locationX >= Main.WINDOW_WIDTH) {
            vanish();
        }

        // 判定 y 轴出界
        if (speedY > 0 && locationY >= Main.WINDOW_HEIGHT ) {
            // 向下飞行出界
            vanish();
        }else if (locationY <= 0){
            // 向上飞行出界
            vanish();
        }
    }

    public int getPower() {
        return power;
    }
}
