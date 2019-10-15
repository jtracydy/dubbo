/*
*  2019 
*/
package utils;

import java.awt.geom.Point2D;

/**
 * @author wangdan Date: 2019/10/15 Time: 09:55
 * @version $Id$
 */
public class JWD {

    private static final double EARTH_RADIUS = 6371393; // 平均半径,单位：m

    /**
     * 通过AB点经纬度获取距离
     *
     * @param pointA A点(经，纬)
     * @param pointB B点(经，纬)
     * @return 距离(单位：米)
     */
    public static double getDistance(Point2D pointA, Point2D pointB) {
        // 经纬度（角度）转弧度。弧度用作参数，以调用Math.cos和Math.sin
        double radiansAX = Math.toRadians(pointA.getX()); // A经弧度
        double radiansAY = Math.toRadians(pointA.getY()); // A纬弧度
        double radiansBX = Math.toRadians(pointB.getX()); // B经弧度
        double radiansBY = Math.toRadians(pointB.getY()); // B纬弧度

        double cos = Math.cos(radiansAY) * Math.cos(radiansBY) * Math.cos(radiansAX - radiansBX)
                + Math.sin(radiansAY) * Math.sin(radiansBY);
        double acos = Math.acos(cos);
        return EARTH_RADIUS * acos; // 最终结果
    }


    public static void main(String[] args) {
        Point2D pointDD = new Point2D.Double(30.660785, 104.04643);
        Point2D pointXD = new Point2D.Double(30.662149329953, 104.04812693669);
        System.out.println(getDistance(pointDD, pointXD));
        System.out.println();

    }
}