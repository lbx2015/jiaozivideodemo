# jiaozivideodemo
<img  src="device20190103161611.gif"/>
简单实用饺子视频框架播放
  1,implementation 'cn.jzvd:jiaozivideoplayer:6.4.1'
  就可以了
  这个demo是在recycleview中实现的。
2,
  recyclerView.addOnChildAttachStateChangeListener(new RecyclerView.OnChildAttachStateChangeListener() {
              @Override
              public void onChildViewAttachedToWindow(View view) {

              }

              @Override
              public void onChildViewDetachedFromWindow(View view) {
                  Jzvd jzvd = view.findViewById(R.id.videoplayer);
                  if (jzvd != null && jzvd.jzDataSource.containsTheUrl(JZMediaManager.getCurrentUrl())) {
                      Jzvd currentJzvd = JzvdMgr.getCurrentJzvd();
                      if (currentJzvd != null && currentJzvd.currentScreen != Jzvd.SCREEN_WINDOW_FULLSCREEN) {
                          Jzvd.releaseAllVideos();
                      }
                  }
              }
          });
 3,直接加载远程视频就好了
    @SuppressLint("LongLogTag")
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Log.i(TAG, "onBindViewHolder [" + holder.jzvdStd.hashCode() + "] position=" + position);

        holder.jzvdStd.setUp(
                VideoConstant.videoUrls[0][position],
                VideoConstant.videoTitles[0][position], Jzvd.SCREEN_WINDOW_LIST);
        Glide.with(holder.jzvdStd.getContext()).load(VideoConstant.videoThumbs[0][position]).into(holder.jzvdStd.thumbImageView);
    }
 4，别忘记加Intenet权限，和运行时获取
 ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.INTERNET}, 1);