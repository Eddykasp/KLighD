/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.krendering.impl;

import de.cau.cs.kieler.core.krendering.HorizontalAlignment;
import de.cau.cs.kieler.core.krendering.KPointPlacement;
import de.cau.cs.kieler.core.krendering.KPosition;
import de.cau.cs.kieler.core.krendering.KRenderingPackage;
import de.cau.cs.kieler.core.krendering.VerticalAlignment;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>KPoint Placement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.core.krendering.impl.KPointPlacementImpl#getReferencePoint <em>Reference Point</em>}</li>
 *   <li>{@link de.cau.cs.kieler.core.krendering.impl.KPointPlacementImpl#getVerticalAlignment <em>Vertical Alignment</em>}</li>
 *   <li>{@link de.cau.cs.kieler.core.krendering.impl.KPointPlacementImpl#getHorizontalAlignment <em>Horizontal Alignment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KPointPlacementImpl extends EObjectImpl implements KPointPlacement {
    /**
     * The cached value of the '{@link #getReferencePoint() <em>Reference Point</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferencePoint()
     * @generated
     * @ordered
     */
    protected KPosition referencePoint;

    /**
     * The default value of the '{@link #getVerticalAlignment() <em>Vertical Alignment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVerticalAlignment()
     * @generated
     * @ordered
     */
    protected static final VerticalAlignment VERTICAL_ALIGNMENT_EDEFAULT = VerticalAlignment.TOP;

    /**
     * The cached value of the '{@link #getVerticalAlignment() <em>Vertical Alignment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVerticalAlignment()
     * @generated
     * @ordered
     */
    protected VerticalAlignment verticalAlignment = VERTICAL_ALIGNMENT_EDEFAULT;

    /**
     * The default value of the '{@link #getHorizontalAlignment() <em>Horizontal Alignment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHorizontalAlignment()
     * @generated
     * @ordered
     */
    protected static final HorizontalAlignment HORIZONTAL_ALIGNMENT_EDEFAULT = HorizontalAlignment.LEFT;

    /**
     * The cached value of the '{@link #getHorizontalAlignment() <em>Horizontal Alignment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHorizontalAlignment()
     * @generated
     * @ordered
     */
    protected HorizontalAlignment horizontalAlignment = HORIZONTAL_ALIGNMENT_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected KPointPlacementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return KRenderingPackage.Literals.KPOINT_PLACEMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public KPosition getReferencePoint() {
        if (referencePoint != null && referencePoint.eIsProxy()) {
            InternalEObject oldReferencePoint = (InternalEObject)referencePoint;
            referencePoint = (KPosition)eResolveProxy(oldReferencePoint);
            if (referencePoint != oldReferencePoint) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, KRenderingPackage.KPOINT_PLACEMENT__REFERENCE_POINT, oldReferencePoint, referencePoint));
            }
        }
        return referencePoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public KPosition basicGetReferencePoint() {
        return referencePoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReferencePoint(KPosition newReferencePoint) {
        KPosition oldReferencePoint = referencePoint;
        referencePoint = newReferencePoint;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KRenderingPackage.KPOINT_PLACEMENT__REFERENCE_POINT, oldReferencePoint, referencePoint));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VerticalAlignment getVerticalAlignment() {
        return verticalAlignment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVerticalAlignment(VerticalAlignment newVerticalAlignment) {
        VerticalAlignment oldVerticalAlignment = verticalAlignment;
        verticalAlignment = newVerticalAlignment == null ? VERTICAL_ALIGNMENT_EDEFAULT : newVerticalAlignment;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KRenderingPackage.KPOINT_PLACEMENT__VERTICAL_ALIGNMENT, oldVerticalAlignment, verticalAlignment));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HorizontalAlignment getHorizontalAlignment() {
        return horizontalAlignment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setHorizontalAlignment(HorizontalAlignment newHorizontalAlignment) {
        HorizontalAlignment oldHorizontalAlignment = horizontalAlignment;
        horizontalAlignment = newHorizontalAlignment == null ? HORIZONTAL_ALIGNMENT_EDEFAULT : newHorizontalAlignment;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KRenderingPackage.KPOINT_PLACEMENT__HORIZONTAL_ALIGNMENT, oldHorizontalAlignment, horizontalAlignment));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case KRenderingPackage.KPOINT_PLACEMENT__REFERENCE_POINT:
                if (resolve) return getReferencePoint();
                return basicGetReferencePoint();
            case KRenderingPackage.KPOINT_PLACEMENT__VERTICAL_ALIGNMENT:
                return getVerticalAlignment();
            case KRenderingPackage.KPOINT_PLACEMENT__HORIZONTAL_ALIGNMENT:
                return getHorizontalAlignment();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case KRenderingPackage.KPOINT_PLACEMENT__REFERENCE_POINT:
                setReferencePoint((KPosition)newValue);
                return;
            case KRenderingPackage.KPOINT_PLACEMENT__VERTICAL_ALIGNMENT:
                setVerticalAlignment((VerticalAlignment)newValue);
                return;
            case KRenderingPackage.KPOINT_PLACEMENT__HORIZONTAL_ALIGNMENT:
                setHorizontalAlignment((HorizontalAlignment)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case KRenderingPackage.KPOINT_PLACEMENT__REFERENCE_POINT:
                setReferencePoint((KPosition)null);
                return;
            case KRenderingPackage.KPOINT_PLACEMENT__VERTICAL_ALIGNMENT:
                setVerticalAlignment(VERTICAL_ALIGNMENT_EDEFAULT);
                return;
            case KRenderingPackage.KPOINT_PLACEMENT__HORIZONTAL_ALIGNMENT:
                setHorizontalAlignment(HORIZONTAL_ALIGNMENT_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case KRenderingPackage.KPOINT_PLACEMENT__REFERENCE_POINT:
                return referencePoint != null;
            case KRenderingPackage.KPOINT_PLACEMENT__VERTICAL_ALIGNMENT:
                return verticalAlignment != VERTICAL_ALIGNMENT_EDEFAULT;
            case KRenderingPackage.KPOINT_PLACEMENT__HORIZONTAL_ALIGNMENT:
                return horizontalAlignment != HORIZONTAL_ALIGNMENT_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (verticalAlignment: ");
        result.append(verticalAlignment);
        result.append(", horizontalAlignment: ");
        result.append(horizontalAlignment);
        result.append(')');
        return result.toString();
    }

} //KPointPlacementImpl
