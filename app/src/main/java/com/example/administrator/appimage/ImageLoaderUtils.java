package com.example.administrator.appimage;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;

import com.nostra13.universalimageloader.cache.disc.DiskCache;
import com.nostra13.universalimageloader.cache.memory.impl.UsingFreqLimitedMemoryCache;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;
import com.nostra13.universalimageloader.core.assist.QueueProcessingType;
import com.nostra13.universalimageloader.core.download.BaseImageDownloader;
import com.nostra13.universalimageloader.utils.StorageUtils;

import java.io.File;

public class ImageLoaderUtils {


    public static void setImageView(String url, Context context, ImageView imageView) {


//        //初始化
//        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(context)
//                .diskCache()//自定义缓存路径
//                .build();
//        //创建Imageloader 对象
//        ImageLoader imageLoader = ImageLoader.getInstance();
//        //设置初始化
//        imageLoader.init(config);
//
//
//        DisplayImageOptions options = new DisplayImageOptions.Builder()
//                .showImageOnLoading(R.mipmap.ic_launcher) //设置图片在下载期间显示的图片
//                .showImageForEmptyUri(R.mipmap.ic_launcher)//设置图片Uri为空或是错误的时候显示的图片
//                .showImageOnFail(R.mipmap.ic_launcher)  //设置图片加载/解码过程中错误时候显示的图片
//                .cacheInMemory(true)//设置下载的图片是否缓存在内存中
//                .cacheOnDisk(true)//设置下载的图片是否缓存在SD卡中
//                .imageScaleType(ImageScaleType.IN_SAMPLE_INT)//设置图片以如何的编码方式显示
//                .bitmapConfig(Bitmap.Config.RGB_565)//设置图片的解码类型
//                .build();//构建完成
//
//        imageLoader.displayImage(url, imageView, options);
//        //.displayer(new RoundedBitmapDisplayer(90))  构建圆形图片


    }


}
