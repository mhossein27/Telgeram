package ir.telgeram.Adel;

import android.view.MotionEvent;
import android.view.View;

public class AdelSwipeTouchListener implements View.OnTouchListener
{
	private float x1 = 0;
	private float x2;

	@Override
	public boolean onTouch(View view, MotionEvent motionEvent)
	{
		switch (motionEvent.getAction())
		{
			case MotionEvent.ACTION_DOWN:
				x1 = motionEvent.getX();
				break;
			case MotionEvent.ACTION_UP:
				x2 = motionEvent.getX();
				float deltaX = x2 - x1;
				if (deltaX > 150)
				{
					onSwipeRight();
					return true;
				}
				if (deltaX < -150)
				{
					onSwipeLeft();
					return true;
				}
				break;
		}
		return false;
	}

	public void onSwipeRight()
	{
	}

	public void onSwipeLeft()
	{
	}
}
