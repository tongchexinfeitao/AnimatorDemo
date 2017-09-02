package com.example.animatordemo;

import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private ImageView icon;
    private LinearLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        icon = (ImageView) findViewById(R.id.cion);
        container = (LinearLayout) findViewById(R.id.container);
    }

    public void onClick(View v) {

        //属性动画  ValueAnimator 的用法  ,属性动画本质是值动画
//        ValueAnimator valueAnimator = ValueAnimator.ofFloat(0f, 1f);
//        valueAnimator.setDuration(2000);
//        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
//            @Override
//            public void onAnimationUpdate(ValueAnimator animation) {
//                float animatedValue = (float) animation.getAnimatedValue();
//                Log.e("TAG", "=========== animatedValue == " + animatedValue);
//                ViewGroup.LayoutParams layoutParams = icon.getLayoutParams();
//                layoutParams.width = (int) (animatedValue * 1000);
//                layoutParams.height = (int) (animatedValue * 1000);
//                icon.setLayoutParams(layoutParams);
//                icon.setAlpha(animatedValue);
//            }
//        });
//        valueAnimator.start();

        //ObjectAnimator的用法

        //透明度变化
//        ObjectAnimator alphaObjectAnimator = ObjectAnimator.ofFloat(icon, "alpha", 0f, 1f, 0.5f);
//        alphaObjectAnimator.setDuration(2000)
//                .start();
//
//        ObjectAnimator scaleXObjectAnimator = ObjectAnimator.ofFloat(icon, "scaleX",0f,1f,0.5f);
//        scaleXObjectAnimator.setDuration(2000)
//                .start();
//
//        ObjectAnimator translationXObjectAnimator = ObjectAnimator.ofFloat(icon, "translationX",0f,1000f);
//        translationXObjectAnimator.setDuration(2000)
//                .start();
//
//        ObjectAnimator rotationObjectAnimator = ObjectAnimator.ofFloat(icon, "rotation",0f,-360f);
//        rotationObjectAnimator.setDuration(2000);
//        rotationObjectAnimator.setRepeatCount(3);
//        rotationObjectAnimator.setRepeatMode(ValueAnimator.REVERSE);
//        rotationObjectAnimator.addListener(new Animator.AnimatorListener() {
//            @Override
//            public void onAnimationStart(Animator animation) {
//
//            }
//
//            @Override
//            public void onAnimationEnd(Animator animation) {
//
//            }
//
//            @Override
//            public void onAnimationCancel(Animator animation) {
//
//            }
//
//            @Override
//            public void onAnimationRepeat(Animator animation) {
//
//            }
//        });
//        rotationObjectAnimator.start();


        //ViewPropertyAnimator的用法
//        icon.animate().alpha(0.5f)
//                .translationX(100f)
//                .rotation(180)
//                .scaleX(2)
//                .scaleY(2)
//                .setStartDelay(2000)
//                .setDuration(3000);

        //AnimatorSet 组合动画
//        AnimatorSet animatorSet = new AnimatorSet();
//        ObjectAnimator alphaObjectAnimator = ObjectAnimator.ofFloat(icon, "alpha", 0f, 1f, 0.5f);
//        ObjectAnimator scaleXObjectAnimator = ObjectAnimator.ofFloat(icon, "scaleX", 0f, 1f, 0.5f);
//        animatorSet.play(alphaObjectAnimator).with(scaleXObjectAnimator);
//        animatorSet.playTogether(alphaObjectAnimator,scaleXObjectAnimator);
//        animatorSet.playSequentially(alphaObjectAnimator, scaleXObjectAnimator);
//        animatorSet.setDuration(3000);
//        animatorSet.start();

        //ObjectAnimator也可以来实现组合动画
//        PropertyValuesHolder alphaXPropertyValuesHolder = PropertyValuesHolder.ofFloat("alpha", 0f, 1f, 0.5f);
//        PropertyValuesHolder scaleXPropertyValuesHolder = PropertyValuesHolder.ofFloat("scaleX", 1f, 2f);
//        ObjectAnimator rotationObjectAnimator = ObjectAnimator.ofPropertyValuesHolder(icon, alphaXPropertyValuesHolder, scaleXPropertyValuesHolder);
//        rotationObjectAnimator.setDuration(2000);
//        rotationObjectAnimator.start();


        //用valueAnimator实现组合动画
//        ValueAnimator valueAnimator = ValueAnimator.ofFloat(0f, 1f);
//        valueAnimator.setDuration(2000);
//        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
//            @Override
//            public void onAnimationUpdate(ValueAnimator animation) {
//                float animatedValue = (float) animation.getAnimatedValue();
//                ViewGroup.LayoutParams layoutParams = icon.getLayoutParams();
//                layoutParams.width = (int) (animatedValue * 300);
//                layoutParams.height = (int) (animatedValue * 300);
//                icon.setLayoutParams(layoutParams);
//                icon.setAlpha(animatedValue);
//            }
//        });
//        valueAnimator.start();


        //用AnimatorInflater去加载ValueAnimator对应的xml文件
//        ValueAnimator valueAnimator = (ValueAnimator)AnimatorInflater.loadAnimator(this, R.animator.value_animator);
//        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
//            @Override
//            public void onAnimationUpdate(ValueAnimator animation) {
//                float animatedValue = (float) animation.getAnimatedValue();
//              icon.setAlpha(animatedValue);
//            }
//        });
//        valueAnimator.setDuration(3000);
//        valueAnimator.start();


        //用AnimatorInflater去加载ObjectAnimator对应的xml文件
//        ObjectAnimator objectAnimator = (ObjectAnimator)AnimatorInflater.loadAnimator(this, R.animator.object_animator);
//        objectAnimator.setDuration(3000);
//        objectAnimator.setTarget(icon);
//        objectAnimator.start();


        //用AnimatorInflater去加载AnimatorSet对应的xml文件
//        Animator animator = AnimatorInflater.loadAnimator(this, R.animator.animator_set);
//        animator.setTarget(icon);
//        animator.start();


        //利用ValueAnimator进行颜色变化动画
//        ValueAnimator valueAnimator;
//        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
//            valueAnimator = ValueAnimator.ofArgb(0xffff0000, 0xff0000ff, 0xff00ff00);
//            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
//                @Override
//                public void onAnimationUpdate(ValueAnimator animation) {
//                    int colorValue = (int) animation.getAnimatedValue();
//                    container.setBackgroundColor(colorValue);
//                }
//            });
//            valueAnimator.setDuration(2000);
//            valueAnimator.start();
//        }


        Point startPoint = new Point(0, 0);
        Point endPoint = new Point(1000, 1000);
        //fraction是一个从0到1变化的值
        ValueAnimator valueAnimator = ValueAnimator.ofObject(new TypeEvaluator<Point>() {
            @Override
            public Point evaluate(float fraction, Point startValue, Point endValue) {
                float startX = startValue.getX();
                float endX = endValue.getX();
                float currentX = startX + fraction * (endX - startX);

                float startY = startValue.getY();
                float endY = endValue.getY();
                float currentY = startY + fraction * (endY - startY);
                return new Point(currentX, currentY);
            }
        }, startPoint, endPoint);

        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                Point point = (Point) animation.getAnimatedValue();
            }
        });
    }
}
